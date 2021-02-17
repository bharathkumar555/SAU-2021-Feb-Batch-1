const readline = require('readline');


const r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

r1.question('Enter the array elements with comma seperation : ', (elements) => { 
		let arr = elements.split(',')
		let num_arr = arr.map(item => parseInt(item));
		console.log("Input array : ",num_arr) 

		num_arr.sort(function(a,b){return a-b});
		console.log("\nSorted array : ",num_arr);

		let mul_arr = arr.map(item => item*10);
		console.log("\nMultiplied by 10 array : ",mul_arr);

		let divBy3 = arr.filter(item => item % 3 === 0);
		console.log("\nElements divisible by 3 are : ",divBy3);
		r1.close();
});






