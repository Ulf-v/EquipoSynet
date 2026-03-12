
const mostrarCaso = async () => {
    const res = await fetch("https://synet.riberadeltajo.es/api/archivos");
    const resJson = await res.json();
    console.log(resJson);
}

document.addEventListener("DOMContentLoaded", mostrarCaso);