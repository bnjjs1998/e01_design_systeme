import Input from "../components/Input/input";
import './LogIn.css';

export default function LogIn() {
  return (
    <form action="post">
      <Input type="text" name="username" labelValue="Nom d'utilisateur"/>
      <Input type="password" name="password" labelValue="Mot de passe"/>
    </form>
  )
}