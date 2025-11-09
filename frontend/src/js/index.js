const inputTxt = document.getElementById("inputTxt");
const enviar = document.getElementById("enviar");
const chat = document.getElementById("chat");
const btnComentarios = document.getElementById("chatbot__btn-comentarios");


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

    const chatbotBoton = document.createElement('button');
    chatbotBoton.className = "chatbot__btn-comentarios";
    chatbotBoton.id = "chatbot__btn-comentarios";
    chatbotBoton.textContent = "Valorar respuesta";
    bloqueTxt.appendChild(chatbotBoton);

    generarFormulario(bloqueTxt);
}

const mostrarForm = (event) => {
    if (event.target.id == "chatbot__btn-comentarios") {
        event.target.nextElementSibling.classList.toggle("mostrar");
    }
}

const generarFormulario = (bloqueTxt) => {

    const form = document.createElement("form");
    form.className = "formulario";
    form.id = "formulario";


    const titulo = document.createElement("h3");
    titulo.className = "formulario__title";
    titulo.textContent = "Formulario de valoración de respuesta";
    form.appendChild(titulo);

    const textarea = document.createElement("textarea");
    textarea.className = "formulario__textarea";
    textarea.name = "valoracion";
    textarea.placeholder = "Escriba aquí su valoración";
    form.appendChild(textarea);

    const article1 = document.createElement("article");
    article1.className = "formulario__selector";
    form.appendChild(article1);

    const label1 = document.createElement("label");
    label1.textContent = "Valoración de redacción";
    article1.appendChild(label1);

    const select1 = crearSelector();
    article1.appendChild(select1);

    const article2 = document.createElement("article");
    article2.className = "formulario__selector";
    form.appendChild(article2);

    const label2 = document.createElement("label");
    label2.textContent = "Valoración de rigurosidad médica";
    article2.appendChild(label2);

    const select2 = crearSelector();
    article2.appendChild(select2);

    const article3 = document.createElement("article");
    article3.className = "formulario__selector";
    form.appendChild(article3);

    const label3 = document.createElement("label");
    label3.textContent = "Valoración de respuesta según contexto";
    article3.appendChild(label3);

    const select3 = crearSelector();
    article3.appendChild(select3);

    const botonEnviar = document.createElement("button");
    botonEnviar.type = "button";
    botonEnviar.className = "formulario__submit";
    botonEnviar.value = "Enviar";
    botonEnviar.textContent = "Enviar";
    form.appendChild(botonEnviar);

    bloqueTxt.appendChild(form);
}

const crearSelector = () => {
    const select = document.createElement('select');
    select.classList = "formulario__select";
    const opcionDisabled = document.createElement("option");
    opcionDisabled.textContent = "Seleccione una nota"
    opcionDisabled.disabled = true;
    opcionDisabled.selected = true;
    select.appendChild(opcionDisabled);

    for (let i = 1; i <= 10; i++) {
        const opcion = document.createElement("option");
        opcion.value = i;
        opcion.textContent = i;
        select.appendChild(opcion);
    }
    return select;
}

enviar.addEventListener('click', mostrarMensaje);
chat.addEventListener('click', mostrarForm);