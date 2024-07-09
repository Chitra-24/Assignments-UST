
var companies = [
    { name: 'Company A', location: 'Location A' },
    { name: 'Company B', location: 'Location B' },
  ];
  
  var jsonString = JSON.stringify(companies);
  console.log("After converting to string"+jsonString);
  
   var jsonString2 = `[
    {"name": "Company A", "location": "Location A"},
    {"name": "Company B", "location": "Location B"}
  ]`;
  console.log("printing string value"+jsonString2);
  
  var companies2 = JSON.parse(jsonString2);
  console.log("after paresing");
  console.log(companies2);
 