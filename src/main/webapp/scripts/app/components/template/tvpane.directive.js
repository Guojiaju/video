(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/23.
   * auth: xzc
   * 未经允许请勿转载
   */
  angular
    .module('frontTvWeb')
    .directive('tvPane', tvPane);

  /** @ngInject */
  function tvPane() {
    var directive = {
      restrict: 'EA',
      templateUrl: 'app/components/template/tvpane.html',
      scope:{
        tvDatas:'=',
      }
    };

    return directive;

  }

})();
