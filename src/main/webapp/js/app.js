'use strict';

angular
  .module('javahisApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ui.bootstrap'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .when('/transaksi/opd', {
        templateUrl: 'views/transaksi/opd.html',
        controller: 'MainCtrl'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl'
      })
      .when('/report/ipd', {
        templateUrl: 'views/report/ipd.html',
        controller: 'ReportIpdCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });