# Hands-on: 4. ReactJS HOL

## Scenario
*	Implementing componentDidMount() hook
*	Implementing componentDidCatch() life cycle hook.

## Steps
### 1️⃣ Initial Setup
* Create a React project named “blogapp” type the following command in terminal of Visual studio:
```bash
npx create-react-app blogapp
```

### 2️⃣ Creating Post Class
* Create a new file under Src folder with the name “Post.js”
* Open the [`Post.js`](./Code/blogapp/src/Post.js) file and add the following code:
```jsx
class Post {
  constructor(id, title, body) {
    this.id = id;
    this.title = title;
    this.body = body;
  }
}

export default Post;
```

### 3️⃣ Creating Posts componenet
* Create a new file under Src folder with the name “Posts.js”
* Open the [`Posts.js`](./Code/blogapp/src/Posts.js) file and add
the following code:
```jsx
import React from 'react';

class Posts extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      posts: []
    };
  }

  loadPosts(){
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
      });
  }

  componentDidMount(){
    this.loadPosts();
  }

  render(){
    return (
      <div>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    ); 
  }

  componentDidCatch(error, info){
    alert('An error occurred: ' + error);
  }
}

export default Posts;
```

### 4️⃣ Using Posts Component
* Open the [`App.js`](./Code/blogapp/src/App.js) file and modify it to use the `Posts` component:
```jsx
import React from 'react';
import Posts from './Posts.js';

function App() {
  return (
    <Posts/>
  );
}

export default App;
```

### 5️⃣ Running the Application
* Open the terminal in Visual Studio Code and run the following command:
```bash
npm start
```

## Output

![`Output`](./Output/Output.png)