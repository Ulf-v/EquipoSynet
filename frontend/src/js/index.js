const inputTxt = document.getElementById("inputTxt");
const enviar = document.getElementById("enviar");
const chat = document.getElementById("chat");

const mostrarMensaje = () => {
    if (inputTxt.value != "") {    
        let date = new Date();
        horas = date.getHours();
        minutos = date.getMinutes();
        
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
    }
}

enviar.addEventListener('click', mostrarMensaje);