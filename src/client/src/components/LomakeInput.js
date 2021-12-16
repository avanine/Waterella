import React, { useState }  from 'react';

<<<<<<< HEAD
const  LomakeInput = ({ value, setValue, label, placeholder, id }) => {
  
  const onChange = (target) => {
    console.log(target.value);
    setValue(target.value);
  };

  return (
      <div className="form-group py-2">
          <label htmlFor={label}>{placeholder}</label>
          <input value={value} onChange={({target}) => onChange(target)} type="text" className="form-control" id={id} placeholder={placeholder} />
      </div>
  )
=======
function LomakeInput(props) {
    return (
        <div className="form-group py-2">
            <label htmlFor={props.label}>{props.placeholder}</label>
            <input type="text" className="form-control" id={props.id} placeholder={props.placeholder} onChange={props.onChange}/>
        </div>
    )
>>>>>>> 875047632038d55c10dd21e0d3fd6bd87a70beb5
}

export default LomakeInput;
