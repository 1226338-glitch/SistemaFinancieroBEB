# Sistema Financiero BEB

## Project Description
Sistema Financiero BEB is a financial management system designed to help users track their expenses and manage their budgets efficiently. This system is built using modern web technologies, ensuring a user-friendly experience.

## Setup Instructions
1. **Clone the Repository**:  
   Run the following command in your terminal:
   ```bash
   git clone https://github.com/1226338-glitch/SistemaFinancieroBEB.git
   ```  

2. **Install Dependencies**:  
   Navigate into the project directory and install the required dependencies using:  
   ```bash
   npm install
   ```

## Database Configuration
To configure the database, follow these steps:
1. **Create a Database**:  
   Create a new database in your database management system (e.g., MySQL, PostgreSQL).

2. **Update Configuration File**:  
   Go to the `config` directory and update the `database.js` file with your database credentials:
   ```js
   module.exports = {
       host: 'localhost',
       user: 'your_username',
       password: 'your_password',
       database: 'your_database_name'
   };
   ```

## Execution Steps
To run the application, execute the following command in your terminal:
```bash
npm start
```
After starting the application, open your web browser and navigate to `http://localhost:3000` to access the system.

## Additional Information
For any additional help or information, please refer to the documentation provided within the repository or contact the project maintainers.