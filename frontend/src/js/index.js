const inputTxt = document.getElementById("inputTxt");
const enviar = document.getElementById("enviar");
const chat = document.getElementById("chat");

escribir = true;

const mostrarMensaje = () => {
    if (inputTxt.value != "" && escribir == true) {
        escribir = false;
        let date = new Date();
        horas = date.getHours();
        minutos = date.getMinutes();
        minutos = minutos + "";

        if (minutos.length <= 1) {
            minutos = "0" + minutos;
        }

        const mensajeUser = document.createElement("article");
        mensajeUser.className = "chatbot__mensaje-user";
        chat.appendChild(mensajeUser);

        const bocadillo = document.createElement("article");
        bocadillo.className = "chatbot__bocadillo";
        mensajeUser.appendChild(bocadillo);

        const txt = document.createElement("p");
        txt.className = "chatbot__txt";
        txt.textContent = inputTxt.value;
        bocadillo.appendChild(txt);

        const hora = document.createElement("p");
        hora.className = "chatbot__hora";
        hora.textContent = horas + ":" + minutos;
        bocadillo.appendChild(hora);

        inputTxt.value = "";

        setTimeout(mostrarTextoIa, 1000);
    }
}

const mostrarTextoIa = () => {

    const bloqueTxt = document.createElement("article");
    bloqueTxt.className = "chatbot__txt-ia";
    chat.appendChild(bloqueTxt);

    const parrafoTxt = document.createElement("p");
    parrafoTxt.className = "chatbot__parrafo-ia";
    bloqueTxt.appendChild(parrafoTxt);

    $i = 0;
    textoRellenar = "";
    textoPrueba = "Esto es un mensaje de prueba para mostrar cómo se mostrarán los mensajes del chatbot que recibirá desde el backend Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nostrum error voluptatibus, similique enim tempore quaerat accusantium omnis praesentium in? Corporis autem alias veniam? Dignissimos magni laboriosam labore beatae, ab pariatur.";

    // intervalo para que aparezcan las letras poco a poco
    const rellenador = setInterval(() => {
        parrafoTxt.textContent = textoRellenar += textoPrueba[$i];
        $i++;

        if ($i >= textoPrueba.length) {
            clearInterval(rellenador);
            escribir = true;
        }
    }, 15);
}


enviar.addEventListener('click', mostrarMensaje);