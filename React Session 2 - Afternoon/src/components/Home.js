import { Container } from "react-bootstrap"
import img1 from '../images/bookBharath.jpg';
import "./Home.css";

export const Home = () => {
    return (
        <div>
      <div >
        <img class="bg-image" src={img1}></img>
      </div>
      <div class="bg-text">Welcome To Book Store</div>
    </div>
    );
}