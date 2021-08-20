import React, { Component } from 'react';

class Soe extends Component {
    constructor(props) {
        super(props);
        this.state = {value: '', primeList: []};
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({value: event.target.value});
    }

    handleSubmit(event) {
        event.preventDefault();
        let xhr = new XMLHttpRequest();
        xhr.addEventListener('load', () => {
            this.setState({primeList:  xhr.response});
        })
        xhr.open('GET', 'http://localhost:8080/q1/' + this.state.value);
        xhr.send();
    }

    render() {
        return (
            <div>
                <h2>Sieve of Eratosthenes</h2>
                <form onSubmit={this.handleSubmit}>
                <label>
                    <p>Enter a max number. All primes will be returned up to this number:</p>
                    <input type="text" value={this.state.value} onChange={this.handleChange} />
                </label>
                <input type="submit" value="Submit" />
                </form>
                <p style={{marginTop: "1em" }}>List of primes: {this.state.primeList}</p>
            </div>
        );
    }
}

export default Soe;
