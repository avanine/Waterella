import React, { useState } from "react";
import LisaaNappi from "./LisaaNappi";
import LomakeInput from "./LomakeInput";

function Lomake() {

    const [podcast, setPodcast] = useState(false);
    const choosePodcast = () => setPodcast(!podcast);

    const handleSubmit = (e) => {
        e.preventDefault();
        /* tässä pitäis jotenkin lisätä tiedot tietokantaan */
        console.log("lomake lähetetty");
        console.log(e.target[0].value)
        console.log(e.target[1].value)
        document.getElementById("form").reset();
    }

    return (
        <div className="container col-md-4 col-md-offset-4">
            <form onSubmit={handleSubmit} className="mt-5" id="form">
                <div className="form-group py-2">
                    <label htmlFor="tyyppi">Vinkin tyyppi</label>
                    <select className="form-control" id="tyyppi">
                        <option>Kirja</option>
                        <option onClick={choosePodcast}>Podcast</option>
                    </select>
                </div>

                <LomakeInput
                    label="otsikko"
                    id="otsikko"
                    placeholder="Otsikko"
                />
                <LomakeInput
                    label="isbn"
                    id="isbn"
                    placeholder="ISBN"
                />
                {podcast && (
                    <LomakeInput
                        label="isbn"
                        id="isbn"
                        placeholder="ISBN"
                    />
                )}
                <div className="form-group py-2">
                    <label htmlFor="lisatiedot">Lisätietoja</label>
                    <textarea className="form-control" id="lisatiedot" rows="3"></textarea>
                </div>
                <button onClick={LisaaNappi.showForm} type="submit" className="btn btn-success mt-2">Lisää</button>
            </form>
        </div>
    )
}

export default Lomake;