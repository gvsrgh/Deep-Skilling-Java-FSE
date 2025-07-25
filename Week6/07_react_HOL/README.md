# Hands-on: 7. ReactJS HOL

## Scenario
Create a React Application named “shoppingapp” with a class component named “OnlineShopping” and “Cart”.

## Steps

### 1️⃣ Initial Setup
* Create a React project named “shoppingapp” by typing the following command in the terminal of Visual Studio:
```bash
npx create-react-app shoppingapp
```

### 2️⃣ Creating OnlineShopping Class
* Navigate to the `src/Components` directory and create a file named [`OnlineShopping.js`](./Code/shoppingapp/src/Components/OnlineShopping.js)
```javascript
import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
    constructor(props) {
        super(props);

        this.items = [
            new Cart("Laptop", 80000),
            new Cart("TV", 120000),
            new Cart("Washing Machine", 50000),
            new Cart("Mobile", 30000),
            new Cart("Fridge", 70000)
        ];
    }

    render() {
        return (
            <div style={{ textAlign: 'center' }}>
                <h2 style={{ color: 'green' }}>Items Ordered :</h2>
                <table border="1" align="center" style={{ color: 'green' }}>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.items.map((item, index) => (
                            <tr key={index}>
                                <td>{item.itemname}</td>
                                <td>{item.price}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}

export default OnlineShopping;
```

### 3️⃣ Creating Cart Class
* In the same directory, create a file named [`Cart.js`](./Code/shoppingapp/src/Components/Cart.js):
```javascript
class Cart {
    constructor(itemname, price) {
        this.itemname = itemname;
        this.price = price;
    }
}

export default Cart;
```

### 4️⃣ Integrating OnlineShopping in App Component
* Open `src/App.js` and modify it to include the `OnlineShopping` component in [`App.js`](./Code/shoppingapp/src/App.js):
```javascript
import React from 'react';
import OnlineShopping from './Components/OnlineShopping.js';

function App() {
  return (
    <div>
      <OnlineShopping />
    </div>
  );
}

export default App;
```

### 5️⃣ Running the Application
* Open the terminal in Visual Studio Code and navigate to the `shoppingapp` directory.
* Run the following command to start the application:
```bash
npm start
```

## Output
![Online Shopping App Output](./Output/Output.png)