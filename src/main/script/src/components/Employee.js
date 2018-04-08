import React, { Component } from 'react';

class Employee extends Component{
	render() {
		return (
			<tr>
				<td>{this.props.employee.name}</td>
				<td>{this.props.employee.age}</td>
				<td>{this.props.employee.department}</td>
				<td>{this.props.employee.designation}</td>
			</tr>
		)
	}
}
export default Employee;