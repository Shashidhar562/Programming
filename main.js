/* var v=1990
to initiate variable we use var or let keyword. var is global scope and let is local scope
console.log(v);

v="IARe"

console.log(v);


*/
// js conditional statements
/* 
if (condition){
    true block;
} else{
    false block;
} */


/* 
var day=1;
switch(day){
    case 1: console.log("Monday"); break;
    case 2: console.log("Tuesday"); break;
    case 3: console.log("Wednesday"); break;
    case 4: console.log("Thursday"); break;
    case 5: console.log("Friday"); break;
}
 */

//object is a data type 
//objects are 2 types. one is class obj and other is regular obj which is created by {}
/* 
var student={
    name:"Joh",
    age:29,
    address:"Delhi",
    phone:"5458754",
    subjects:["eng","maths","social"]
}
console.log(student.subjects[2]);
console.log(student.name) */

//Looping statements:For loop, While loop, Do-while loop, For-of loop, For-in loop
/* 
for (var i=0; i<10; i++){
    console.log(i)
}
console.log("Finished",i)

for (let i=0; i<10; i++){
    console.log(i)
}
console.log("Finished",i) */

//for-of. can only be used on arrays

//var a=[10,45,"khbdf","bhdv"]
/* for (var i=0; i<a.length; i++){
    console.log(a[i])
}
 */

/* for (var value of a){
    console.log(value)
} */

//for-in
/* var s={
    name:"Rajiv",
    age:123,
    roll:"asdfg",
    address:{
        city:"Hyderabad", state:"TS", pincode:500090
    }
}

for (const key in s){
    if (key=="address"){
        for (const value in s[key]){
            console.log(key,s[key][value])
        }
    }else{
        console.log(s[key])
    }
} */

//even number. arr.map(), arr.filter(), arr.reduce()

var l=[1,2,3,4,5,6,7,8,9,10]
/* var li=[]
for(var v of l){
    if (v%2==0){
        li.push(v)
    }
}console.log(li)

var ans=l.filter(function(value){
    return value%2==0
})
console.log(ans) */

//map
l.map(function(element){
    console.log("Element",element)
})

//reduce
var sum=l.reduce(function(acc,ele){
    return acc+ele 
})
console.log("Sum",sum)

