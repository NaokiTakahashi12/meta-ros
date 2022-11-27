# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The ROS client library in C++."
AUTHOR = "Ivan Paunovic <ivanpauno@ekumenlabs.com>"
ROS_AUTHOR = "Dirk Thomas <dthomas@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rclcpp"
ROS_BPN = "rclcpp"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    builtin-interfaces \
    libstatistics-collector \
    rcl \
    rcl-interfaces \
    rcl-yaml-param-parser \
    rcpputils \
    rcutils \
    rmw \
    rosgraph-msgs \
    rosidl-runtime-cpp \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
    statistics-msgs \
    tracetools \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-gen-version-h-native \
    ament-cmake-ros-native \
    python3-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    builtin-interfaces \
    libstatistics-collector \
    rcl \
    rcl-interfaces \
    rcl-yaml-param-parser \
    rcpputils \
    rcutils \
    rmw \
    rosgraph-msgs \
    rosidl-runtime-cpp \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
    statistics-msgs \
    tracetools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libstatistics-collector \
    rcl \
    rcl-yaml-param-parser \
    rcpputils \
    rcutils \
    rmw \
    statistics-msgs \
    tracetools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-google-benchmark \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    mimick-vendor \
    performance-test-fixture \
    rmw \
    rmw-implementation-cmake \
    rosidl-default-generators \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rclcpp-release/archive/release/humble/rclcpp/16.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rclcpp"
SRC_URI = "git://github.com/ros2-gbp/rclcpp-release;${ROS_BRANCH};protocol=https"
SRCREV = "b533885baa2650ff1cd0c670d6fd2b579b83e8df"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
