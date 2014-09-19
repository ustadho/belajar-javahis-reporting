/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


angular
  .module('testApp', [
    'ngResource',
    'ngRoute',
    'ui.bootstrap'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'test-pages/home.html'
      })
      .when('/transaksi/opd', {
        templateUrl: 'views/transaksi/opd.html',
        controller: 'MainCtrl'
      })
      .when('/about', {
        templateUrl: 'test-pages/about.html'
      })
      .when('/report/opd', {
        templateUrl: 'test-pages/opd.html'
      })
      .otherwise({
        redirectTo: '/'
      });
  });