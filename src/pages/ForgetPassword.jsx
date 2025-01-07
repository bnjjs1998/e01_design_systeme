import Input from "../components/Input/input";
import './ForgetPassword.css';

export default function ForgetPassword() {
  return (
    <form action="post">
      <Input type="password" name="password" labelValue="Mot de passe"/>
      <Input type="password" name="confirmPassword" labelValue="Confirmez mot de passe"/>
    </form>
  )
}