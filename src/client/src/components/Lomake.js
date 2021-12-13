import React, { useState } from "react";
import LisaaNappi from "./LisaaNappi";
import LomakeInput from "./LomakeInput";
function Lomake() {
  const [type, setType] = useState('Kirja');
  const [header, setHeader] = useState('');
  const [ISBN, setISBN] = useState('');

  const handleSubmit = (e) => {
        e.preventDefault();
        /* tässä pitäis jotenkin lisätä tiedot tietokantaan */
        console.log("lomake lähetetty");
        console.log(type)
        console.log(header)
        {type==='Kirja' && console.log(ISBN)}
    }
  const onChange = (target) => {
      setType(target.value);
    };

    return (
        <div className="container col-md-4 col-md-offset-4">
            <form onSubmit={handleSubmit} className="mt-5" id="form">
                <div className="form-group py-2">
                    <label htmlFor="tyyppi">Vinkin tyyppi</label>
                  <select onChange={({ target}) => onChange(target)} className="form-control" id="tyyppi">
                        <option value="Kirja">Kirja</option>
                        <option value="Podcast" >Podcast</option>
                    </select>
                </div>

                <LomakeInput
                    label="otsikko"
                    id="otsikko"
                    placeholder="Otsikko"
                    setValue={setHeader}
                    value={header}
                />
                {type==='Kirja' && (
                    <LomakeInput
                        label="isbn"
                        id="isbn"
                        placeholder="ISBN"
                        setValue={setISBN}
                        value={ISBN}
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
