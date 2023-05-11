const  textbox=document.getElementById("output");

function gainAccess(event) {
    const curElement = event.target
    //console.log(curElement);
    var value=curElement.innerText;
    var prevalue=textbox.value;
    if (value=="="){
        const result=eval(prevalue)
        textbox.value=result
    }
    else{
        console.log(prevalue);
        textbox.value=prevalue+""+value
            
    }
    if (value=="AC"){
        textbox.value=""
    }
   
}


const boxes=document.querySelectorAll(".btn");
console.log(boxes)

for (const ele of boxes) {
    ele.addEventListener("click", gainAccess);
}
    