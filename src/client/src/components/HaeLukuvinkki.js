import React, { useState, useEffect } from "react"
import { useNavigate } from 'react-router-dom';


const HaeLukuvinkki = () => {

    const [search, setSearch] = useState('')
    let navigate = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault();
        navigate(`${search}`)
    }

    return (
        <form onSubmit={handleSubmit}>
            <label htmlFor="header-search">
                <span className="visually-hidden">Hae kirjaa</span>
            </label>
            <input
                onInput={e => setSearch(e.target.value)}
                type="text"
                id="header-search"
                placeholder="Hae lukuvinkki"
                name="s"
            />
            <button type="submit">Search</button>
        </form>

    )

}

export default HaeLukuvinkki;