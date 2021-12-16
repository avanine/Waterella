import {
  BrowserRouter as Router, Routes, Route
} from "react-router-dom"

import Otsikko from "./Otsikko";
import VinkkiLista from "./VinkkiLista";
import HaeLukuvinkki from "./HaeLukuvinkki";
import SingleLukuvinkki from "./SingleLukuvinkki";

function App() {

  return (
    <Router>
      <Routes>
        <Route path="/" element={<VinkkiLista tyyppi="Kirjat" />} />
        <Route path=":lukuvinkkiId" element={<SingleLukuvinkki />} />
      </Routes>
    </Router>

  );
}

export default App;
