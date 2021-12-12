
import Otsikko from "./Otsikko";
import VinkkiLista from "./VinkkiLista";

function App() {

  return (
    <div>
      <Otsikko />
      <div className="row px-5">
        <VinkkiLista tyyppi="Kirjat" />
        <VinkkiLista tyyppi="Podcastit" />
      </div>
    </div>
  );
}

export default App;
