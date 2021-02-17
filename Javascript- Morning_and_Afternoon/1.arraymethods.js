var fruits=[ "Orange", "Apple","Banana","Mango"];
f1=["Kiwi","Lemon"];

fruits=fruits.concat(f1);
console.log(fruits);

console.log("every method")
var x=fruits.every((fruit) =>
{
	return fruit.length>10;
	
})
console.log(x);

console.log("\nforEach method")
fruits.forEach((item) =>{
console.log(item);
	
});

console.log("\nfilter  method");
var con_arr=fruits.filter((item) =>
{
	return item.length%2==0;
});
console.log(con_arr);

console.log("\nindexOf  method")
var ind=fruits.indexOf("Apple");

var s="Hi this is bharath";
console.log(ind,s.indexOf("th"));

console.log("\njoin  method")
var jo_s=fruits.join(" ");
console.log(jo_s);

console.log("\nlastIndexOf method");
console.log(s.lastIndexOf("th"));

console.log("\nmap method")
var map_arr=fruits.map((item) =>{
	return item+"_map";
});
console.log(map_arr);

console.log("\nreduce  method")


var numbers=[200,150,30,10];
var red1=numbers.reduce((item,item1) =>
{
	return item-item1;
})
console.log(red1);


console.log("\nreduceRight  method")
var numbers=[200,150,30,10];
var red1=numbers.reduceRight((item,item1) =>
{
	return item-item1;
})
console.log(red1);


fruits_dup=fruits.slice();
console.log("\n reverse method");
fruits_dup.reverse();
console.log("original:",fruits,"\n","reversed:",fruits_dup);


console.log("\n shift method");

var shift_num=fruits.shift();
console.log(shift_num);

console.log("\n slice method");
var slice_arr=fruits.slice(1,4);
console.log(slice_arr);


console.log("\n some method");
var some_var=fruits.some((item) =>{
	return item.length>7;
});
console.log(some_var);


console.log("\ntoSource method");
//console.log(fruits.toSource());


console.log("\nsort method");
console.log(fruits.sort());


console.log("\nsplice method");
fruits.splice(2,2, "Lemon", "Kiwi");
console.log(fruits);

console.log("\nunshift method");
fruits.unshift("Pineapple");
console.log(fruits);


console.log("\ntoString method");
console.log(fruits.toString());



console.log("\npop method")
var p=fruits.pop();
console.log(p)

console.log("\n push method");
fruits.push("Grapes");
console.log(fruits)
