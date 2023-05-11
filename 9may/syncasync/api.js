/* console.log(1);
console.log(2);
console.log(3);
console.log(4);

setTimeout(() {}, timeout);
 */
/* 
const prm=new Promise(function(resolve, reject){
    console.log("fetching data from datbase");
    setTimeout(()=>{
        resolve("got data from datbase");
        reject("failed to fetch data from datbase");
    } ,3000)
})
console.log(prm);

prm.then(function(result){
    console.log("in then method");
    console.log(result)
})

prm.catch(function(error){
    console.log("in catch method")
    console.log(error)
})
 */

function getUserData(){
    const data=fetch("https://randomuser.me/api/");
    console.log(data);
    data.then(function(res){
        const result=res.json();
        result.then(function(userData){}
        console.log(res);
    })
    data.catch(function(err){
        console.log(err);
    })

//Sync function
/* function getUserData(){
    const data = fetch("https://randomuser.me/api/")
    console.log(data)
    data.then(function(res){
        const result = res.json()
        result.then(function(userData){
            console.log(userData)
        })
    })
    data.catch(function(err){
        console.log(err)
    })
}
getUserData() */

//Async function
/* async function getUserData_v2() {
    const data = await fetch("https://randomuser.me/api/")
    var result = await data.json()
    console.log(result)
}
getUserData_v2() */