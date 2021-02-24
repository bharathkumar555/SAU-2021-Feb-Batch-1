import "./App.css";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import { Home } from "./components/Home.js";
import { Add } from "./components/Add";
import { Detail } from "./components/bookDetails";
import { Search } from "./components/Search.js";
import { Container, Nav, Navbar } from "react-bootstrap";

function App() {
  return (
    <Router>
      <header>
        <Navbar bg="dark" expand="lg">
          <div className="container">
            <div className="inner-content">
              <div className="brand">
                <Navbar.Brand href="/" style = {{color : '#ffffff'}}>Bharath's Book Store</Navbar.Brand>
              }
              </div>
              <ul className="nav-links">
                <li>
                  <Nav.Item>
                    <Link to="/">Home Page</Link>
                  </Nav.Item>
                </li>

                <li>
                  <Nav.Item>
                    <Link to="/add">Insert Books</Link>
                  </Nav.Item>
                </li>

                <li>
                  <Nav.Item>
                    <Link to="/list">Books List</Link>
                  </Nav.Item>
                </li>
                
              </ul>
            </div>
          </div>
        </Navbar>
      </header>

              

      <Container>
        <Switch>
          <Route exact path="/">
            <Home />{" "}
          </Route>
          <Route path="/list">
            <Search />{" "}
          </Route>
          <Route path="/add">
            <Add />
          </Route>
          <Switch>
            <Route path="/detail/:id" children={<Detail />} />
          </Switch>
        </Switch>
      </Container>
    </Router>


  );
}

export default App;
