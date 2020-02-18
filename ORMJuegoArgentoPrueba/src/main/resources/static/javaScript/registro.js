window.addEventListener('load',function(){
  var boton= document.querySelector ("button.btn.btn-primary");
  boton.addEventListener('click',function(){
    var errores= false;
    var email= document.querySelector("input.email");
    var nombre= document.querySelector("input.valida-nombre");
    var apellido= document.querySelector("input.valida-apellido");
    var apodo= document.querySelector("input.valida-apodo");
    var contraseña= document.querySelector("input.valida-contraseña");
    var recontraseña= document.querySelector("input.valida-recontraseña");
    var provincia= document.querySelector("input.valida-provincia");
    var ciudad= document.querySelector("input.valida-ciudad");
    var nombre2= document.querySelector("input.valida-nombre2");

    var errorEmail= document.querySelector("span.errorEmail");
    var errorNombre= document.querySelector("span.errorNombre");
    var errorApellido= document.querySelector("span.errorApellido");
    var errorApodo= document.querySelector("span.errorApodo");
    var errorContraseña= document.querySelector("span.errorContraseña");
    var errorReContraseña= document.querySelector("span.errorReContraseña");
    var errorProvincia= document.querySelector("span.errorProvincia");
    var errorCiudad= document.querySelector ("span.errorCiudad");
    var errorNombre2= document.querySelector("span.errorNombre2");

    var regexMail= /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
    var regexContraseña = "^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$";

  //  email.onblur=function(){
      if(email.value == ''){
        errorEmail.innerHTML= "Este campo es obligatorio";
         email.style.border= "1px solid red";
           errores=true;
      }else if(!regexMail.test(email.value)){
        errorEmail.innerHTML= "Formato inválido"
         email.style.border= "1px solid red";
         errores= true;
      }else {
        errorEmail.innerHTML= "";
        email.style.border= "1px solid green";
      }
//}


    if(nombre.value == ""){
      errorNombre.innerHTML= "Este campo es obligatorio";
      nombre.style.border= "1px solid red";
      errores=true;
    }else if( nombre.value.length <2){
      errorNombre.innerHTML= "Debe contener al menos 2 caracteres"
      nombre.style.border= "1px solid red";
      errores= true;
    }else {
      errorNombre.innerHTML= "";
      nombre.style.border= "1px solid green";
    }


    if(apellido.value == ""){
      errorApellido.innerHTML= "Este campo es obligatorio";
      apellido.style.border= "1px solid red";
      errores=true;
    }else if( apellido.value.length <2){
      errorApellido.innerHTML= "Debe contener al menos 2 caracteres"
      apellido.style.border= "1px solid red";
      errores= true;
    }else {
      errorApellido.innerHTML= "";
      apellido.style.border= "1px solid green";
    }


    if(apodo.value == ""){
      errorApodo.innerHTML= "Este campo es obligatorio";
      apodo.style.border= "1px solid red";
      errores=true;
    }else if( apodo.value.length <2){
      errorApodo.innerHTML= "Debe contener al menos 2 caracteres"
      apodo.style.border= "1px solid red";
      errores= true;
    }else {
      errorApodo.innerHTML= "";
      apodo.style.border= "1px solid green";
    }


    if(contraseña.value == ""){
      errorContraseña.innerHTML= "Este campo es obligatorio";
      contraseña.style.border= "1px solid red";
      errores=true;
    }else if( contraseña.value.length <5){
      errorContraseña.innerHTML= "Debe contener al menos 5 caracteres"
      contraseña.style.border= "1px solid red";
      errores= true;
    }else {
      errorContraseña.innerHTML= "";
      contraseña.style.border= "1px solid green";
    }


    if(recontraseña.value == ""){
      errorReContraseña.innerHTML= "Este campo es obligatorio";
      recontraseña.style.border= "1px solid red";
      errores=true;
    }else if( recontraseña.value != contraseña.value){
      errorReContraseña.innerHTML= "Debe ser Igual a la contraseña ingresada"
      recontraseña.style.border= "1px solid red";
      errores= true;
    }else {
      errorReContraseña.innerHTML= "";
      recontraseña.style.border= "1px solid green";
    }

    if(ciudad.value == ''){
      errorCiudad.innerHTML= "Este campo es obligatorio";
      ciudad.style.border= "1px solid red";
      errores=true;
    }else if(ciudad.value.length <3){
      errorCiudad.innerHTML= "Debe contener al menos 3 caracteres"
      ciudad.style.border= "1px solid red";
      errores= true;
    }else {
      errorCiudad.innerHTML= "";
      ciudad.style.border= "1px solid green";
    }


    if(provincia.value != "Selecciona una provincia"){
      errorProvincia.innerHTML= "Debe seleccionar una provincia";
      provincia.style.border= "1px solid red";
      errores=true;
    }else {
      errorReContraseña.innerHTML= "";
      recontraseña.style.border= "1px solid green";
    }


  });
});
