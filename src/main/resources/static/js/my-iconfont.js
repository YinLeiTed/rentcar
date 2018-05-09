;(function(window) {

  var svgSprite = '<svg>' +
    '' +
    '<symbol id="icon-diansanmarker" viewBox="0 0 1024 1024">' +
    '' +
    '<path d="M676.895508 564.964431c0 0-32.799508-32.760123-73.239631-73.176615l-71.766646-71.711508c-40.479508-40.448-73.255385-73.208123-73.255385-73.208123L767.519508 38.1952c40.440123-40.400738 106.031262-40.432246 146.495015 0l71.766646 71.711508c40.448 40.440123 40.448 105.968246 0.007877 146.392615L676.895508 564.964431 676.895508 564.964431zM676.895508 564.964431"  ></path>' +
    '' +
    '<path d="M255.495877 362.818954c72.704-72.688246 165.935262-67.040492 210.093292-22.906092l218.253785 218.104123c40.203815 40.180185 46.922831 134.396062-25.796923 207.044923L255.495877 362.818954 255.495877 362.818954zM255.495877 362.818954"  ></path>' +
    '' +
    '<path d="M416.634092 607.665231l-64.630154-64.582892L7.876923 1016.123077l470.709169-346.560985L416.634092 607.665231zM416.634092 607.665231"  ></path>' +
    '' +
    '</symbol>' +
    '' +
    '<symbol id="icon-mapmarkerradius" viewBox="0 0 1024 1024">' +
    '' +
    '<path d="M512 85.333333C653.226667 85.333333 768 198.826667 768 339.2 768 529.493333 512 810.666667 512 810.666667 512 810.666667 256 529.493333 256 339.2 256 198.826667 370.773333 85.333333 512 85.333333M512 256C465.066667 256 426.666667 294.4 426.666667 341.333333 426.666667 388.266667 465.066667 426.666667 512 426.666667 558.933333 426.666667 597.333333 388.266667 597.333333 341.333333 597.333333 294.4 558.933333 256 512 256M853.333333 810.666667C853.333333 904.96 700.586667 981.333333 512 981.333333 323.413333 981.333333 170.666667 904.96 170.666667 810.666667 170.666667 755.626667 222.72 706.56 303.36 675.413333L330.666667 714.24C284.586667 733.44 256 759.893333 256 789.333333 256 848.213333 370.773333 896 512 896 653.226667 896 768 848.213333 768 789.333333 768 759.893333 739.413333 733.44 693.333333 714.24L720.64 675.413333C801.28 706.56 853.333333 755.626667 853.333333 810.666667Z"  ></path>' +
    '' +
    '</symbol>' +
    '' +
    '</svg>'
  var script = function() {
    var scripts = document.getElementsByTagName('script')
    return scripts[scripts.length - 1]
  }()
  var shouldInjectCss = script.getAttribute("data-injectcss")

  /**
   * document ready
   */
  var ready = function(fn) {
    if (document.addEventListener) {
      if (~["complete", "loaded", "interactive"].indexOf(document.readyState)) {
        setTimeout(fn, 0)
      } else {
        var loadFn = function() {
          document.removeEventListener("DOMContentLoaded", loadFn, false)
          fn()
        }
        document.addEventListener("DOMContentLoaded", loadFn, false)
      }
    } else if (document.attachEvent) {
      IEContentLoaded(window, fn)
    }

    function IEContentLoaded(w, fn) {
      var d = w.document,
        done = false,
        // only fire once
        init = function() {
          if (!done) {
            done = true
            fn()
          }
        }
        // polling for no errors
      var polling = function() {
        try {
          // throws errors until after ondocumentready
          d.documentElement.doScroll('left')
        } catch (e) {
          setTimeout(polling, 50)
          return
        }
        // no errors, fire

        init()
      };

      polling()
        // trying to always fire before onload
      d.onreadystatechange = function() {
        if (d.readyState == 'complete') {
          d.onreadystatechange = null
          init()
        }
      }
    }
  }

  /**
   * Insert el before target
   *
   * @param {Element} el
   * @param {Element} target
   */

  var before = function(el, target) {
    target.parentNode.insertBefore(el, target)
  }

  /**
   * Prepend el to target
   *
   * @param {Element} el
   * @param {Element} target
   */

  var prepend = function(el, target) {
    if (target.firstChild) {
      before(el, target.firstChild)
    } else {
      target.appendChild(el)
    }
  }

  function appendSvg() {
    var div, svg

    div = document.createElement('div')
    div.innerHTML = svgSprite
    svgSprite = null
    svg = div.getElementsByTagName('svg')[0]
    if (svg) {
      svg.setAttribute('aria-hidden', 'true')
      svg.style.position = 'absolute'
      svg.style.width = 0
      svg.style.height = 0
      svg.style.overflow = 'hidden'
      prepend(svg, document.body)
    }
  }

  if (shouldInjectCss && !window.__iconfont__svg__cssinject__) {
    window.__iconfont__svg__cssinject__ = true
    try {
      document.write("<style>.svgfont {display: inline-block;width: 1em;height: 1em;fill: currentColor;vertical-align: -0.1em;font-size:16px;}</style>");
    } catch (e) {
      console && console.log(e)
    }
  }

  ready(appendSvg)


})(window)