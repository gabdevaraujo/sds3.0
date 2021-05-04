import DataTable from "components/DataTable/Index";
import Footer from "components/Footer/Index";
import NavBar from "components/NavBar/Index";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Ola Mundo!</h1>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
