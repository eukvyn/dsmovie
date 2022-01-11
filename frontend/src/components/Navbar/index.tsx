import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/eukvyn">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="eukvyn-contact-link">/eukvyn</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;