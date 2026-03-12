const edad = document.getElementById("edad");
const sexo = document.getElementById("sexo");
const antecedentes = document.getElementById("antecedentes");
const antecedentesQuir = document.getElementById("antecedentesQuir");
const habitos = document.getElementById("habitos");
const situacionBas = document.getElementById("situiacionBas");
const medicacion = document.getElementById("medicacion");
const antecedentesFam = document.getElementById("antecedentesFam");
const motivo = document.getElementById("motivo");
const sintomas = document.getElementById("sintomas");
const exploracion = document.getElementById("exploracion");
const signos = document.getElementById("signos");
const resultados = document.getElementById("resultados");
const razonamiento = document.getElementById("razonamiento");
const diagnosticoFinal = document.getElementById("diagnósticoFinal");
const tratamientoFarma = document.getElementById("tratamientoFarma");
const tratamientoNoFarma = document.getElementById("tratamientoNoFarma");
const factores = document.getElementById("factores");
const alergias = document.getElementById("alergias");
const referencias = document.getElementById("referencias");
const formMedico = document.getElementById("formMedico");
const valorarBtn = document.getElementById("valorarBtn");
const formularioMedico = document.getElementById("formularioMedico");

const cargarCasos = async () => {
    formMedico.classList.add("hidden");
    const res = await fetch("https://synet.riberadeltajo.es/api/archivos");
    const resJson = await res.json();

    mostrarCaso(resJson);
}

const mostrarCaso = (casosJson) => {
    const rand = Math.floor(Math.random() * casosJson.length);
    const caso = casosJson[rand];

    edad.textContent = caso.edad;
    sexo.textContent = caso.sexo;
    antecedentes.textContent = caso.antecedentes_medicos;
    antecedentesQuir.textContent = caso.antecedentes_quirurgicos;
    habitos.textContent = caso.habitos;
    situacionBas.textContent = caso.situacion_basal;
    medicacion.textContent = caso.medicacion_actual;
    antecedentesFam.textContent = caso.antecedentes_familiares;
    motivo.textContent = caso.motivo;
    sintomas.textContent = caso.sintomas;
    exploracion.textContent = caso.exploracion_general;
    signos.textContent = caso.signos;
    resultados.textContent = caso.resultados_pruebas;
    razonamiento.textContent = caso.razonamiento_clinico;
    diagnosticoFinal.textContent = caso.diagnostico_final;
    tratamientoFarma.textContent = caso.tratamiento_farmacologico;
    tratamientoNoFarma.textContent = caso.tratamiento_no_farmacologico;
    factores.textContent = caso.factores_sociales;
    alergias.textContent = caso.alergias;
    referencias.textContent = caso.referencias_bibliograficas;
}

const mostrarForm = () => {
    formMedico.classList.toggle("hidden");
}
const sendForm = (event) => {
    event.preventDefault();
    window.location.href = "./validacion_Medicos.html";
}
document.addEventListener("DOMContentLoaded", cargarCasos);
valorarBtn.addEventListener("click", mostrarForm);
formularioMedico.addEventListener("submit", sendForm)