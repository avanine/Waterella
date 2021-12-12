
function LomakeInput(props) {
    return (
        <div className="form-group py-2">
            <label htmlFor={props.label}>{props.placeholder}</label>
            <input type="text" className="form-control" id={props.id} placeholder={props.placeholder} />
        </div>
    )
}

export default LomakeInput;