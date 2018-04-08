import React, { Component } from 'react';
import './App.css';
import EmployeeList from './components/EmployeeList';

class App extends Component {
	constructor(props) {
		super(props);
		this.state = {
			employees: [],
			isLoading: false
		};
	}

	componentDidMount() {
		this.setState({
			isLoading: true
		});
		fetch('http://localhost:8080/api/employees/')
		.then(result => result.json())
	    .then(data => this.setState(
	    		{
					employees: data._embedded.employees,
					isLoading: false
				}
	    		));
		}

  render() {
	  const {employees, isLoading} = this.state;
	  if (isLoading) {
      return <p>Loading...</p>;
    }
	  return (
				<EmployeeList employees={employees}/>
			);
  }
}

export default App;