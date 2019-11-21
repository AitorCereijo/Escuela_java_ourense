
window.addEventListener("load",function(){
    
    document.getElementById("btn_peticion_ajax").innerHTML.onclick=function(){
        
         var objAjax = new XMLHttpRequest();
    
    objAjax.onreadystatechange = function(){
        
        console.log("State: "+this.readyState+", Status: "+this.status);
        console.log("Texto respuesta: "+this.responseText);
        
        if(this.readyState===4 && this.status===200){
            
            document.getElementById("div_datos_json").innerHTML=this.responseText;
            
            var respuestaObj = JSON.parse(this.responseText);
             document.getElementById("div_datos").innerHTML = `
             
             <span style="font-weight: bold">Nombre:</span> ${respuestaObj.nombre}
              <span style="font-weight: bold">Edad:</span> ${respuestaObj.edad}
              <span style="font-weight: bold">Fibonacci:</span> ${respuestaObj.fibonacci}`;
            
            for(var numFib of respuestaObj.fibonacci){
                
                document.getElementById("div_datos").innerHTML += " - "+numFib;
                
            }
            
        }
    };
    
    objAjax.open("GET","./datosjson");
    objAjax.send();
    console.log("Peticion enviada");
    
     
        
    };
    
   
    
});
