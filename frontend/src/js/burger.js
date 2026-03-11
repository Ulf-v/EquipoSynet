const btnHamburguesa = document.getElementById('btnHamburguesa');
const menuLateral = document.getElementById('menuLateral');
const overlay = document.getElementById('overlay');

const toggleMenu = () => {
    btnHamburguesa.classList.toggle('abierto');
    menuLateral.classList.toggle('abierto');
    overlay.classList.toggle('activo');
};

btnHamburguesa.addEventListener('click', () => toggleMenu());
overlay.addEventListener('click', () => toggleMenu());