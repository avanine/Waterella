import React, { useState } from "react";
import Lomake from "./Lomake";

function LisaaNappi() {

    const [show, setShowForm] = useState(false);
    const showForm = () => setShowForm(!show);

    return (
        <div>
            <button onClick={showForm} type="button" className="btn btn-lg btn-outline-light mt-2">Lisää uusi</button>
            {show && (
                <Lomake />
            )}
        </div>
    )
}

export default LisaaNappi;