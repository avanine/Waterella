import React, { useState }  from 'react';

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
}

export default LomakeInput;