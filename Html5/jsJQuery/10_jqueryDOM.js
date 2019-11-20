
jQuery(document).ready(function(){



jQuery("section").append("<div><p>LEYENDA DE LO QUE SEA</p></div>");
$("tr").append("<td>INFO</td>");
$(".articulo").append("<p>UN PARRAFO EN CADA ARTICULO</p>");
$("td:nth-child(6)").attr("style","background-color:red");

$("td:nth-child(6)").click(() => {alert('un click desde JQ')});


/*$("#otro_menu").append("<p>............</p></br></br>");
$("#otro_menu").click(function(){

    $(this).slideUp(); //REFERENCIA AL OBJETO SOBRE EL QUE ESTAMOS ACTUANDO
});*/

$(".articulo").click(function(){

    
    $(this).slideUp();}
    
);

$("h2,h3").click(function(){

    
    $(".articulo").slideDown();});


    // ---------EJERCICIO------------
    
    $("article").each( function(contador){

        let idArticulo="articulo_293349_"+contador;
        $(this).attr("id","articulo_"+contador);

        $("#otro_menu").append(" <a href='#articulo_"+contador+"' class='clase_"+contador+"'>Articulo nº: "+contador+"</a>")


        $(".clase_"+contador).click(function(){

            if($("#articulo_"+contador).css('display')==='none'){

            $("article").slideUp();
            $("#articulo_"+contador).slideDown();
            $(".clase_"+contador).attr("href","#articulo_"+contador);
        }
            else{

                $("#articulo_"+contador).slideUp();
                
                $(".clase_"+contador).attr("href","#titulo");

            }
    
        })
    
    });

    $("img").click(function(){

        if($("img").css("width")=="100px"){

        $("img").animate({
            width: '200px',
            height:'200px',
            opacity: '1'
            
             
        },'slow');}

        else if($("img").css("width")=="200px"){

            $("img").animate({
                width: '100px',
                height:'100px',
                opacity: '0.6'
               
            },'slow');
        }

       
      }); 






});


