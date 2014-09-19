'use strict';

/**
 * @ngdoc function
 * @name belajarYeomanApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the belajarYeomanApp
 */
angular.module('javahisApp')
        .controller('ReportIpdCtrl', function($scope, $window) {
            $scope.print = function() {
                console.log('tekan print');
//          $http.get('http://localhost:8080/javahis-reporting/test-print/export.pdf');
                $window.location = 'test-print/export.pdf';
            };
            $scope.openStartDate = function($event) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.dpStartOpened = true;
            };
            $scope.openEndDate = function($event) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.dpEndOpened = true;
            };

        });
