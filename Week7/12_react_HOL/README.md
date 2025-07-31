# Hands-on: 12. ReactJS HOL

## Scenario
Create a React Application named “ticketbookingapp” where the guest user can browse the page where the flight details are displayed whereas the logged in user only can book tickets.

The Login and Logout buttons should accordingly display different pages. Once the user is logged in the User page should be displayed. When the user clicks on Logout, the Guest page should be displayed.

## Steps
### 1️⃣ Initial Setup
* Create a React project named “ticketbookingapp” by typing the following command in the terminal of Visual Studio:
```bash
npx create-react-app ticketbookingapp
```
### 2️⃣ Editing App.js
* Open the [`src/App.js`](./Code/ticketbookingapp/src/App.js) file and replace its content with the following code:
```javascript
import React, { useState } from 'react';
import LoginButton from './Components/LoginButton';
import LogoutButton from './Components/LogoutButton';
import Greeting from './Components/Greeting';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  let button;
  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div>
      <Greeting isLoggedIn={isLoggedIn} />
      {button}
    </div>
  );
}

export default App;
```

### 3️⃣ Creating Components
* Create a folder named `Components` inside the `src` directory.
* Inside the `Components` folder, create three files: `LoginButton.js`, `LogoutButton.js`, and `Greeting.js`.
* press this to go to the file
  * [`LoginButton.js`](./Code/ticketbookingapp/src/Components/LoginButton.js)
  * [`LogoutButton.js`](./Code/ticketbookingapp/src/Components/LogoutButton.js)
  * [`Greeting.js`](./Code/ticketbookingapp/src/Components/Greeting.js)
    * In Greetings we use UserGreeting and GuestGreeting components to display different messages based on the login status.
    * [`UserGreeting.js`](./Code/ticketbookingapp/src/Components/UserGreeting.js)
    * [`GuestGreeting.js`](./Code/ticketbookingapp/src/Components/GuestGreeting.js)
  
### 4️⃣ Running the Application
* Open the terminal in Visual Studio Code and navigate to the project directory.
* Start the React application by running:
```bash
npm start
```

## Output
#### Login
![Login Output](./output/login.png)

#### Logout
![Logout Output](./output/logout.png)


### Explain about conditional Rendering in react
Conditional rendering in React allows you to render different UI elements based on certain conditions. This is typically done using JavaScript expressions within JSX. You can use conditional statements like `if`, `else`, or the ternary operator to determine what should be displayed.

### Define Element Variables in React
In React, you can define variables that hold JSX elements. This allows you to create reusable components or store UI elements in variables for conditional rendering. For example:
```javascript
const element = <h1>Hello, World!</h1>;
```

### Explain how to prevent components from rendering
To prevent components from rendering in React, you can use conditional statements to control whether a component should be displayed. This can be achieved by returning `null` or using logical operators. For example:
```javascript
{isLoggedIn ? <UserGreeting /> : <GuestGreeting />}
```
```javascript
return isLoggedIn ? <UserGreeting /> : null;
```