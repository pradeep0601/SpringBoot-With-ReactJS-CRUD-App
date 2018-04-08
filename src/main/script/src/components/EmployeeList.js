import React, { Component } from 'react';
import Employee from './Employee';

class EmployeeList extends React.Component{
	render() {
		var employees = this.props.employees.map(employee =>
			<Employee key={employee._links.self.href} employee={employee}/>
		);
		return (
			<table className = 'table'>
				<tbody>
					<tr>
						<th>Name</th>
						<th>Age</th>
						<th>Department</th>
						<th>Designation</th>
					</tr>
					{employees}
				</tbody>
			</table>
		)
	}
}
export default EmployeeList;