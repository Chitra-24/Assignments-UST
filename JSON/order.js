//Problem statement 2
var orders = [
    { name: 'Order 1', description: 'Description 1', date: '2023-02-01', status: 'Pending' },
    { name: 'Order 2', description: 'Description 2', date: '2023-02-02', status: 'Shipped' },
    { name: 'Order 3', description: 'Description 3', date: '2023-02-03', status: 'Delivered' },
  ];

  var jsonOrders = orders.map(order => {
    return {
      orders: {
        name: order.name,
        description: order.description,
        date: order.date,
        status: order.status,
      },
    };
  });
  console.log("map values");
  console.log(jsonOrders);


  var ordersList = require('./order.json');
console.log("JSON TO JS FILE "+ordersList);
console.log(ordersList);