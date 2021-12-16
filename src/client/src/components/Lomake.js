import React, { useEffect, useState } from "react";
import LisaaNappi from "./LisaaNappi";
import LomakeInput from "./LomakeInput";
import lukuvinkkiService from '../services/lukuvinkit'

function Lomake() {

    // const [podcast, setPodcast] = useState(false);
    const [otsikko, setOtsikko] = useState('')
    const [tyyppi, setTyyppi] = useState('kirja')
    const [kuvaus, setKuvaus] = useState('')

    // const choosePodcast = () => {
    //     setPodcast(!podcast)
    //     podcast ? setTyyppi('podcast') : setTyyppi('kirja')
    // };

    const handleTyyppiChange = (event) => {
        setTyyppi(event.target.value)
    }


    const handleOtsikkoChange = (event) => {
        setOtsikko(event.target.value)
    }

    const handleKuvausChange = (event) => {
        setKuvaus(event.target.value)
    }

    const handleSubmit = (e) => {
        e.preventDefault();

        console.log('otsikko: ', otsikko)

        lukuvinkkiService.create({
            name: otsikko,
            category: tyyppi,
            description: kuvaus
        }).then(response => {
            console.log('res: ', response)
            setOtsikko('')
            setTyyppi('')
            setKuvaus('')
        }).catch(error => {
            console.log(error.response.data.error)
        })

    }

    return (
        <div className="container col-md-4 col-md-offset-4">
            <form onSubmit={handleSubmit} className="mt-5" id="form">
                <div className="form-group py-2">
                    <label htmlFor="tyyppi">Vinkin tyyppi</label>
                    <select className="form-control" id="tyyppi" onChange={handleTyyppiChange}>
                        <option value="kirja">Kirja</option>
                        <option value="podcast">Podcast</option>
                    </select>
                </div>

                <LomakeInput
                    label="otsikko"
                    id="otsikko"
                    placeholder="Otsikko"
                    onChange={handleOtsikkoChange}
                />

                <div className="form-group py-2">
                    <label htmlFor="lisatiedot">Lisätietoja</label>
                    <textarea value={kuvaus} onChange={handleKuvausChange} className="form-control" id="lisatiedot" rows="3"></textarea>
                </div>
                <button onClick={LisaaNappi.showForm} type="submit" className="btn btn-success mt-2">Lisää</button>
            </form>
        </div>
    )
}

export default Lomake;