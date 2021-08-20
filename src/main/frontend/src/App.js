import './App.css';
import Soe from './Soe';

function App() {
  return (
    <div className="App">
        <header>
            <h1>ERP Assessment</h1>
        </header>
        <div className="container">
            <Soe></Soe>
            <div style={{marginTop: "10px"}} className="container">
                <p style={{paddingBottom: "3px" }}>Checkout the swagger page if you want to look at a nicer interface:</p>
                <a href="http://localhost:8080/swagger-ui/"><h3>Swagger Interface</h3></a>
            </div>
        </div>
    </div>
  );
}

export default App;
