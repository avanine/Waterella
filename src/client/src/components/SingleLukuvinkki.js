import React, { useState, useEffect } from "react";
import lukuvinkkiService from '../services/lukuvinkit'
import { useParams, useNavigate } from 'react-router-dom'



const SingleLukuvinkki = () => {

    const [lukuvinkit, setLukuvinkit] = useState([])
    let params = useParams()
    const lukuvinkki = lukuvinkit.find(lv => lv.name === params.lukuvinkkiId)
    console.log('lukuvinkki: ', lukuvinkki)
    let navigate = useNavigate()


    useEffect(() => {
        lukuvinkkiService.getAll().then(response => {
            setLukuvinkit(response)
        })
    },[])

    return (
        lukuvinkki ? (<div className="single-lukuvinkki">
            <h2>{lukuvinkki.name}</h2>
            <div>
                <div>{lukuvinkki.category}</div>
                <div>{lukuvinkki.description}</div>
            </div>
            <button onClick={() => navigate("/")}>Takaisin</button>
        </div>
        
        ) :
        <div>loading</div>
    )
}

export default SingleLukuvinkki