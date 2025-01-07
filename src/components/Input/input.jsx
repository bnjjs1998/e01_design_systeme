import './input.css';

export default function Input({ type, name, placeholder, labelValue }) {
  return (
    <>
      <label for={ name }>{labelValue}</label>
      <span></span>
      <input type={ type } name={ name } placeholder={ placeholder }/>
    </>
  );
}