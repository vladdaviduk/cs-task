const path = require('path');
const webpack = require('webpack');
const TerserPlugin = require('terser-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    optimization: {
        minimizer: [new TerserPlugin()],
    },
    entry: {
        app: './js/app/app.js'
    },
    output: {
        path: path.resolve(__dirname, '../src/main/resources/static'),
        filename: 'index.min.js'
    }, resolve: {
        modules: ['node_modules']
    },
    module: {
        rules: [
            {
                test: /\.css$/,
                loaders: ['style-loader', 'css-loader']
            }
        ]
    },
    plugins: [
        new TerserPlugin(),
        new HtmlWebpackPlugin({
            template: './views/index.html',
            minify: true
        })
    ]
};