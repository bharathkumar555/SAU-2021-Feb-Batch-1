const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

var pos=-1;
Regex_fun = (test_string) => {
    lion_regex= new RegExp("^lion")
    cat_regex = new RegExp("cat$")
    abc_regex = new RegExp("ab+c")
    
    if(lion_regex.test(test_string)){
      pos=0;
    }

    else if(cat_regex.test(test_string)){
      pos=test_string.search(cat_regex);
    }

    else if(abc_regex.test(test_string)){
      pos=test_string.search(abc_regex);
      
    }

    else {
      pos=-1;
    }
}

rl.question('Enter a text to search : ', (test_string) => {
  Regex_fun(test_string)
  if(pos==-1)
  {
    console.log("false ",pos);
  }
  else
  {
    console.log("true ",pos)

  }
  rl.close();
});