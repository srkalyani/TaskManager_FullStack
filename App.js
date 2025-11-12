// frontend/src/App.js
import React from 'react';
import AddTask from './components/AddTask';
import TaskList from './components/TaskList';

const App = () => {
  const [refresh, setRefresh] = React.useState(false);

  const handleRefresh = () => setRefresh(!refresh);

  return (
    <div className="App">
      <h1>Task Manager</h1>
      <AddTask onTaskAdded={handleRefresh} />
      <TaskList key={refresh} />
    </div>
  );
};

export default App;
