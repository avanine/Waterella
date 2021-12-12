
function VinkkiLista(props) {
    return (
        <div className="col-md-6 mb-4">
            <h2>{props.tyyppi}</h2>
            <ul className="list-group">
                <li className="list-group-item">vinkki1</li>
                <li className="list-group-item">vinkki2</li>
                <li className="list-group-item">vinkki3</li>
            </ul>
        </div>
    )
}

export default VinkkiLista;