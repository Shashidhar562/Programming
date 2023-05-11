// window.navigator
// window.document
// window.location
// window.screen
// //Storage
// window.localStorage
// window.sessionStorage
// window.alert

/* document.getElementById()-
document.getElementsByClassName()
document.getElementsByTagName()
document.getElementsByName()

////////////////////////////////
document.querySelector()
document.querySelectorAll()

////////////////////////////////
 */


/* var firstname=document.getElementById("fname");
console.log("firstname);
 */

var myForm = document.getElementById("customform");

var input = document.createElement("input");
input.type = "text";
input.className="form-control mt-3";
input.style=""
input.placeholder="enter name";
input.id="username";
myForm.appendChild(input);

var input2 = document.createElement("input");
input2.type = "email";
input2.className="form-control mt-3";
input2.placeholder="Enter email";
input2.id="email";
myForm.appendChild(input2);

var input3 = document.createElement("input");
input3.type="password";
input3.className="form-control mt-3";
input3.placeholder="enter password";
input3.id="password";
myForm.appendChild(input3);

var input4=document.createElement("input");
input4.type="date";
input4.className="form-control mt-3";
input4.placeholder="Enter date";
input4.id="DOB";
myForm.appendChild(input4);

var input5 = document.createElement("button")
input5.type="submit";
input5.placeholder="Submit"
input5.className="form-control btn btn-primary mt-3";
input5.id="submit";
input5.innerText="Submit";
myForm.appendChild(input5);

function handleSubmit(event){
    event.preventDefault();

    var emmail=document.getElementById("email").value;
    var userrname=document.getElementById("username").value;
    var datee=document.getElementById("date").value;
    console.log(emmail, userrname, datee);
}
input5.addEventListener("submit", handleSubmit)
//document.getElementById("customform").submit();
