import React, { useState, useEffect } from "react";
import lukuvinkkiService from '../services/lukuvinkit'

function VinkkiLista(props) {

    const [lukuvinkit, setLukuvinkit] = useState([]);

    useEffect(() => {
        lukuvinkkiService.getAll().then(response => {
            setLukuvinkit(response)
        })
    }, [])

    return (
        <div className="col-md-6 mb-4">
            <h2>{props.tyyppi}</h2>
            <ul className="list-group">
                {lukuvinkit.map(lukuvinkki =>
                    <li key={lukuvinkki.name}>
                        {lukuvinkki.name}
                    </li>
                )}
            </ul>
        </div>
    )
}

export default VinkkiLista;