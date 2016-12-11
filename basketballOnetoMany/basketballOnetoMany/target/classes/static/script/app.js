// app.js
angular.module('sortApp', [])

.controller('mainController', function($scope) {
  $scope.sortType     = 'date'; // set the default sort type
  $scope.sortReverse  = false;  // set the default sort order
  $scope.searchFixtures   = '';     // set the default search/filter term
  
  // create the list of fixtures
  $scope.timetable = [
    { date: 'November 01,2016', time: '07.30 PM', fixture: 'Detroit Pistons vs. New York Knicks', location: 'Auburn Hills', price: '50.00 $', network: 'ESPN' },
    { date: 'November 02,2016', time: '07.30 PM', fixture: 'New York Knicks vs. Houston Rockets', location: 'New York, NY', price: '50.00 $', network: 'MSG' },
    { date: 'November 04,2016', time: '10.30 PM', fixture: 'Chicago Bulls vs. New York Knicks', location: 'Chicago, IL', price: '45.00 $', network: 'NBATV' },
    { date: 'November 06,2016', time: '10.30 PM', fixture: 'New York Knicks vs. Utah Jazz', location: 'New York, NY', price: '45.00 $', network: 'NBATV' },
    { date: 'November 09,2016', time: '05.30 PM', fixture: 'New York Knicks vs. Brooklyn Nets', location: 'New York, NY', price: '50.00 $', network: 'NBATV' },
    { date: 'November 26,2016', time: '07.00 PM', fixture: 'New York Knicks vs. Oklahoma Thunders', location: 'New York, NY', price: '50.00 $', network: 'MSG' },
    { date: 'December 05,2016', time: '10.30 PM', fixture: 'Toronto Raptors vs. New York Knicks', location: 'Toronto, Canada', price: '50.00 $', network: 'ESPN' },
    { date: 'November 11,2016', time: '09.00 PM', fixture: 'Boston Celtics vs. New York Knicks', location: 'Boston, MA', price: '50.00 $', network: 'NBATV' },
    { date: 'November 12,2016', time: '06.00 PM', fixture: 'Toronto Raptors vs. New York Knicks', location: 'Toronto, Canada', price: '50.00 $', network: 'NBATV' },
    { date: 'November 13,2016', time: '10.30 PM', fixture: 'New York Knicks vs. Dallas Mavericks', location: 'New York, NY', price: '50.00 $', network: 'MSG' },
    { date: 'December 10,2016', time: '10.30 PM', fixture: 'New York Knicks vs. Los Angeles Lakers', location: 'Los Angeles, LA', price: '50.00 $', network: 'ESPN' },
  ];
  
  //*application.controller('someshit', function($scope, $http){
  //*$http.get('http://http://localhost:8080/bookstores')
  //*.success(function(response){
  //*	$scope.title = response.title;
  //*	})
  //*	});
  
});
